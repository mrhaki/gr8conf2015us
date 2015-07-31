def list = ['Gr8Conf2015US', 'Groovy', 'Grails', 'Gradle', 'Gr8Conf2015US'].asImmutable()

println list

println list.indices

def alphabet = 'a'..'z'
def alphabetIndices = alphabet.indices.collect { it + 1 }

def c = [alphabet, alphabetIndices].transpose()

def word = 'groovy'

word.inject([]) { position, letter ->
    position << c.find { it.first() == letter }.last()
}
