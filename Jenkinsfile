pipeline {
    // https://github.boozallencsn.com/krajewski-frank/jenkins-examples/blob/mvn-ssh-release/Jenkinsfile
//     agent { dockerfile true }
    agent any

    tools {
        maven 'Maven 3'   // maven should be setup as a tool in Jenkins
    }
    stages {

        stage('Run App '){
//             agent {
//                 docker { image 'maven:3-alpine' }
//             }
            steps {
                dir("${env.WORKSPACE}") {
                    sh "mvn --version"
                    echo "Launching Spring Boot app...."
                    sh "nohup mvn spring-boot:run &"
                    sh "sleep 10"
                    echo "App Launched"
                    sh "curl http://localhost:8081"
                 }
            }
        }

         stage('Test'){
//              agent {
//                  docker { image 'maven:3-alpine' }
//              }
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
