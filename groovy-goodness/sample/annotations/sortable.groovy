import groovy.transform.*

@Canonical
@Sortable(includes = ['name', 'max'])
class Course {
    String name
    Date beginDate
    Integer max
}

def groovy = new Course(name: 'Groovy', beginDate: new Date() + 7, max: 200)
def grails3 = new Course(name: 'Grails 3', beginDate: new Date() + 10, max: 350)
def grails2 = new Course(name: 'Grails 2', beginDate: new Date() + 1, max: 240)

def courses = [groovy, grails3, grails2]

def sorted = courses.toSorted()

sorted.each { println it }

def sortedByMax = courses.toSorted(Course.comparatorByMax())

sortedByMax.each { println it }

println Course.declaredMethods.name


