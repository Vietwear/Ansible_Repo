23332.3.getClass().getName()
println 3/1
def s='anh yeu em nhieu lam ${1+2}'
println "hi ${1+3}" 
job('DSL-Tutorial-1-Test') {
    scm {
        git('git://github.com/jgritman/aws-sdk-test.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
