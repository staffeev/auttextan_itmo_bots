require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: hello
        intent!: *(прив/здрав/~добрый (день/утро/вечер)/хай)*
        a: А?! Кто здесь?!?!?!

    state: weather
        intent!: {*~погод*/(на улице/сегодня/завтра)/~температур*/(~дождь/~снег/~град)*}
        a: Какая бы ни была погода, на душе всегда пасмурно...

    state: currency
        intent!: {*~курс*/(~доллар/~евро/~рубль/~валют*/~стоимост*/обмен*)*}
        a: Мой вам совет: покупайте деньги

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}
