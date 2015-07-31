import groovy.util.logging.*

@Log('LOG')
class Gr8Conf {
    def greeting() {    
        LOG.info 'Entering greeting method'
    
        println "Hello Gr8Conf"
    }
}

def gr8conf = new Gr8Conf()
gr8conf.greeting()