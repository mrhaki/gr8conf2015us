package gr8conf

import groovy.transform.*
import groovy.transform.builder.*

@ToString
@Builder(builderStrategy=InitializerStrategy, excludes='description')
class Course {
    String name
    Date beginDate
    Integer max
    String description
}


def groovy = new Course('Groovy',new Date() + 7, 200)

def groovy2 = new Course(Course.createInitializer().name('Groovy 2').beginDate(new Date() + 10).max(300))


def courses = [groovy, groovy2]

courses.each { println it }
println()
