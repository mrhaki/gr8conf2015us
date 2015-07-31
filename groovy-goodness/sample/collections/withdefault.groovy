def list = ['Gr8Conf2015US', 'Groovy', 'Grails', 'Gradle'].withDefault { 'Rocks' }


println list[5]
println list
println list.size()

def numbers = [].withEagerDefault { index -> index }


println numbers[100]
println numbers