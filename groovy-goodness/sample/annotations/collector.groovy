import groovy.transform.*

@AnnotationCollector([Canonical,Sortable])
interface POGO {}

@POGO()
class Course {
    String name
    Date beginDate
    Integer max
}

def groovy = new Course(name: 'Groovy', beginDate: new Date() + 7, max: 200)
def grails3 = new Course(name: 'Grails 3', beginDate: new Date() + 10, max: 350)
def grails2 = new Course(name: 'Grails 2', beginDate: new Date() + 1, max: 240)

def courses = [groovy, grails3, grails2]

println courses.toSorted()

