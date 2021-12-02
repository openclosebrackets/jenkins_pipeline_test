library "pipline_shared_lib"

pipeline {
    agent any
    stages {
        stage('install') {
            steps {
                script{
                    test.printHello()
                    
                }
                echo 'Hello, JDK'
            }
        }
    }
}
