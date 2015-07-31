def list = ['Gr8Conf2015US', 'Groovy', 'Grails', 'Gradle']

println list

println list.take(3)

println list.drop(2)

println list.takeRight(2)

println list.dropRight(2)

println list.takeWhile { it.size() > 6 }

println list.dropWhile { it.size() > 6 }