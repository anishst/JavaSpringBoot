pipeline {
    // https://github.boozallencsn.com/krajewski-frank/jenkins-examples/blob/mvn-ssh-release/Jenkinsfile
    agent { dockerfile true }

    stages {

        stage('Run App '){
            steps {
                dir("${env.WORKSPACE}") {
                    echo "Launching Spring Boot app...."
                    sh "nohup mvn spring-boot:run &"
                    sh "sleep 10"
                    echo "App Launched"
//                     sh "curl http://localhost:8080"
                 }
            }
        }

         stage('Test'){
            steps {
                dir("${env.WORKSPACE}") {
                    echo "Running Java Cucumber Tests...."
                    sh "pwd"
                    sh "mvn test"

                 }
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying Code..."
                echo "Deployment Completed!"
            }
        }
    }

        // post {
        //     always {
        //         record test results
        //         junit '**/reports/*.xml'
        //     }
        // }
}
