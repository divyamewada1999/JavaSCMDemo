def modules = [:]
pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script{
                    modules.first = load "jenkins/hello.groovy"
                    modules.first.greetMsg()
                }
            }
        }
    }
}