package gr8conf

import groovy.transform.*


@ToString(includeNames=true, includePackage=false, ignoreNulls=true,cache=false)
@Immutable(copyWith=true)
class Course {
    String name
    Date beginDate
    Integer max
}

def groovy = new Course(name: 'Groovy', beginDate: new Date() + 7, max: 200)
def grails3 = new Course(name: 'Grails 3', beginDate: new Date() + 10, max: 350)
def grails3_1 = grails3.copyWith(beginDate: new Date() + 17)

def courses = [groovy, grails3, grails3_1]

courses.each { println it }
println()

grails3_1.max = 300