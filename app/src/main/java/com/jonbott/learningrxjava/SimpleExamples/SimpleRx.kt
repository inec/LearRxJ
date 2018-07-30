package com.jonbott.learningrxjava.SimpleExamples

import io.reactivex.disposables.CompositeDisposable
import com.jakewharton.rxrelay2.BehaviorRelay
import kotlinx.coroutines.experimental.defer

object SimpleRx{
    var bag=CompositeDisposable()

    fun simpleValues(){
        println("~~~~~~~SimipleValue~~~~~")

        val someInfo= BehaviorRelay.createDefault("1")
    }
}