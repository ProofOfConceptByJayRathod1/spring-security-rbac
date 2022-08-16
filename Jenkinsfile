pipeline{

    agent any

//     environment{
//
//             MYSQL_DATABASE: 'spring-security-rbac'
//             MYSQL_USER: 'sa'
//             MYSQL_PASSWORD: 'password'
//             MYSQL_ROOT_PASSWORD: 'password'
//
//     }



    stages{

       stage("verify tooling"){
            steps {
              bat '''

              docker compose version

              '''
            }
       }


  stage("build") {
      steps {
        echo 'installing maven'
        bat 'mvn install'
      }
    }









    stage('Prune Docker data') {
      steps {
        bat 'docker system prune -a --volumes -f'
      }
    }

    stage('Start container') {
      steps {
        bat 'docker compose up'
        bat 'docker compose ps'
      }
    }


      stage("deploy"){
        steps {
          echo 'deploying the application...'
        }
      }

//
//     post {
//       always {
//         sh 'docker compose down --remove-orphans -v'
//         sh 'docker compose ps'
//       }
//     }

  }


}