package com.training.java.reactivestreams;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;

public class TransformProcessor<T, R> extends SubmissionPublisher<R> implements Flow.Processor<T, R> {
    private Function<T, R> function;
    private Flow.Subscription subscription;

    public TransformProcessor(Function<T, R> function) {
        this.function = function;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(T item) {
        super.submit(function.apply(item));
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        super.close();
    }
}
