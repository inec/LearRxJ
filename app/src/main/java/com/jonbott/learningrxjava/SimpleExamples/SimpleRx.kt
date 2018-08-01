package com.jonbott.learningrxjava.SimpleExamples

import io.reactivex.disposables.CompositeDisposable
import com.jakewharton.rxrelay2.BehaviorRelay
import kotlinx.coroutines.experimental.defer

object SimpleRx{
    var bag=CompositeDisposable()

    fun simpleValues(){
        println("~~~~~~~SimipleValue~~~~~")

        val someInfo= BehaviorRelay.createDefault("1")
        println("emoji someInfo.value ${someInfo.getValue()}")

        val plainString= someInfo.getValue()
        println("emoji someInfo.value $plainString")

        someInfo.accept("2")

        println("emoji someInfo.value ${someInfo.getValue()}")


        someInfo.subscribe {newValue->
                    println("unicorn")
        }

        someInfo.accept("3")
        //NOTE: relay
    }
}