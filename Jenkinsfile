pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                sh 'echo "Hello bash"'
                sh 'date'
                sh 'pwd'
                sh 'date +%H:%M:%S >> logt.txt'
                sh 'ls -la'
            }
        }
    }
}
