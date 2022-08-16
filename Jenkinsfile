pipeline{
    agent any

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
            echo 'building springboot'
            bat 'docker build . -t spring-security-rbac'
          }
        }

    stage('Prune Docker data') {
      steps {
      echo 'not pruning the container'
//         bat 'docker system prune -a --volumes -f'
      }
    }

//     stage('Start container') {
//       steps {
//         bat 'docker compose up'
//         bat 'docker compose ps'
//       }
//     }


		stage('Login') {

			steps {
				bat "docker login -u=jayneversettle -p=746589@Jay"
			}
		}

		stage('Push') {

			steps {
				bat "docker push jayneversettle/rbac_server:latest"
			}
		}
//
//       stage("deploy"){
//         steps {
//           echo 'deploying the application...'
//         }
//       }


  }


}