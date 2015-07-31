package gr8conf

import groovy.transform.*


@ToString(includeNames=true, includePackage=false, ignoreNulls=true,cache=false)
class Course {
    String name
    Date beginDate
    Integer max
}

def groovy = new Course(name: 'Groovy', beginDate: new Date() + 7, max: 200)
def grails3 = new Course(name: 'Grails 3', beginDate: new Date() + 10, max: 350)
def grails2 = new Course(name: 'Grails 2', beginDate: new Date() + 1)

def courses = [groovy, grails3, grails2]

courses.each { println it }
println()

grails2.max = 300

courses.each { println it }
println()

