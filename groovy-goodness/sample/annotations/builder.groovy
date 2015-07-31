package gr8conf

import groovy.transform.*
import groovy.transform.builder.*

@Canonical
@Builder(buildMethodName='new')
class Course {
    String name
    Date beginDate
    Integer max
}

def groovy = new Course(name: 'Groovy', beginDate: new Date() + 7, max: 200)

def groovy2 = Course.builder().name('Groovy 2').beginDate(new Date() + 10).max(300).new()

def grails3 = new Course(name: 'Grails 3', beginDate: new Date() + 10, max: 350)
def grails2 = new Course(name: 'Grails 2', beginDate: new Date() + 1, max: 240)

def courses = [groovy, groovy2, grails3, grails2]

courses.each { println it }
println()
