@library("pipline_shared_lib") _

pipeline {
    agent any
    stages {
        stage('install') {
            steps {
                test.printHello()
                echo 'Hello, JDK'
            }
        }
    }
}
