package com.training.java.reactivestreams;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Flow;

public class EndSubscriber<T> implements Flow.Subscriber<T> {
    private Flow.Subscription subscription;

    public List<T> consumeElements = new LinkedList<>();
    private boolean completed;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(T item) {
        consumeElements.add(item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        completed = true;
    }

    public List<T> getConsumeElements() {
        return consumeElements;
    }

    public boolean isCompleted() {
        return completed;
    }
}
