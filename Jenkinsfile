node {
	stage('Checkout') {
		sh 'echo Checking out branch: ${BRANCH_NAME}';
		git url: 'git@github.com:yipwanlai/demo-jenkinsfile.git', branch: '${BRANCH_NAME}';
	}

	stage('Set environment variables') {
		env.DH='d-lhr1-docker-013'
		//env.DH=${hostname}
		echo "Setting environment variables DH=${env.DH}"
	}

	stage('Build and test') {
	    steps {
	        // setup test
	        sh 'make setup-test'

	        // test
	        sh 'make test'

	        // teardown test
	        sh 'teardown-test'
	    }
	}

	post {
	    always {
	        junit 'target/*-reports/*.xml'
	    }
	    failure {
	        mail to: blue@awin.com
	    }
	}
}
