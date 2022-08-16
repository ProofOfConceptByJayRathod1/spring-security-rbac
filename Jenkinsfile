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
              sh '''

              docker version
              docker info
              docker compose version

              '''
            }
       }

    stage('Prune Docker data') {
      steps {
        sh 'docker system prune -a --volumes -f'
      }
    }

    stage('Start container') {
      steps {
        sh 'docker compose up -d --no-color --wait'
        sh 'docker compose ps'
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