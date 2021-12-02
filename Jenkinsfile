library "pipline_shared_lib"

pipeline {
    agent any
    options {
        ansiColor('xterm')
    }
    stages {
        stage('install') {
            steps {
                script{
                    test.printHello()
                    echo '\033[34mHello\033[0m \033[33mcolorful\033[0m \033[35mworld!\033[0m'
                }
                echo 'Hello, JDK'
            }
        }
    }
}
