require: slotfilling/slotFilling.sc
  module = sys.zb-common
require: dateTime/dateTime.sc
  module = sys.zb-common
theme: /
    
    state: Start
        q!: $regex</start>
        a: Начнём.
    
    state: Week Day
        q!: *(~неделя * /~день ~недели * /~какой ~день  */~какой ~сегодня ~день * /~какой ~сегодня ~день ~недели * /~какой ~сегодня ~день *) *
        script:
            $temp.date = currentDate();
        a: {{$temp.date.format("dddd")}}
    
    state: Date
        q!: * (~дата*/сегодня*/число*/день*/какая ~дата*/какое число*/сколько число*) *
        script:
            $temp.date = currentDate();
        a: {{$temp.date.format("DD.MM.YYYY")}}

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}