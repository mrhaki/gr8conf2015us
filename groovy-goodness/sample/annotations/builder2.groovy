package gr8conf

import groovy.transform.*
import groovy.transform.builder.*

@Canonical
class Course {
    String name
    Date beginDate
    Integer max
}

@Builder(builderStrategy=ExternalStrategy, forClass=Course, buildMethodName='new')
class CourseBuilder {}

def groovy = new Course(name: 'Groovy', beginDate: new Date() + 7, max: 200)

def groovy2 = new CourseBuilder().name('Groovy 2').beginDate(new Date() + 10).max(300).new()


def courses = [groovy, groovy2]

courses.each { println it }
println()
