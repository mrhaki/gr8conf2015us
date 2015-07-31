package gr8conf

import groovy.transform.*

@ToString
class Event {
    @Delegate(excludes='after') Date start
    @Delegate(excludes='before') Date end
    String name
}

def gr8conf = new Event(start: new Date() - 2, end: new Date(), name: 'Gr8Conf US')

println(gr8conf.after(new Date()))
println gr8conf.before(new Date() -3)
