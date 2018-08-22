package com.kodelabs.boilerplate.domain.interactors;

import com.kodelabs.boilerplate.domain.interactors.base.Interactor;

/**
 * author：Martin Nan on 2018/8/22 09:28
 * <p>
 * If you can't fly,then run,
 * if you can't run,then walk,
 * if you can't walk,then crawl,
 * but whatever you do you have to keep moving forward.
 * Stay hungry. Stay foolish
 */
public interface WelcomeingInteractor extends Interactor{
   interface Callback{
       void onMessageR(String message);
       void onFailed(String error);

   }

}
