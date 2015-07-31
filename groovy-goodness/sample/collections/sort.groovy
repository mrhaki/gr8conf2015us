def list = ['Gr8Conf2015US', 'Groovy', 'Grails', 'Gradle', 'Gr8Conf2015US'].asImmutable()

println list

try {
    println list.sort()
    println list
} catch (all) {}

println list.toSorted()
println list

println list.toUnique()    