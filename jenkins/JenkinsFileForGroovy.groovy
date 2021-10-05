def modules = [:]
pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script{
                    modules.first = load "../hello.groovy"
                    modules.first.greetMsg()
                }
            }
        }
    }
}