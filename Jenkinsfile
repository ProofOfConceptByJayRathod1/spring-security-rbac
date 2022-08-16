pipeline{

    agent {


      dockerfile true

    }

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
            echo 'not using docker compose'
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


  stage("buildmysql") {
      steps {
        echo 'pulling mysql from docker'
        bat 'docker run --name mysqldb -e MYSQL_DATABASE=spring-security-rbac -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -e MYSQL_ROOT_PASSWORD=password -d mysql:5.6'
      }
    }

      stage("buildspringbootapp") {
          steps {
            echo 'building mysql'
            bat 'docker build -t spring-security-rbac'
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