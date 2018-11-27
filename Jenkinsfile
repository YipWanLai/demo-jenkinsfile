node {
    tools {
        maven '3.5.3'
        jdk '1.8.0.172'
    }
	stage('Checkout') {
		sh 'echo Checking out branch: ${BRANCH_NAME}';
		git url: 'git@github.com:yipwanlai/demo-jenkinsfile.git', branch: '${BRANCH_NAME}';
	}

	stage('Set environment variables') {
		env.DH='d-lhr1-docker-013'
		//env.DH=${hostname}
		echo "Setting environment variables DH=${env.DH}"
	}

	stage('Setup test') {
	    // setup test
	    sh 'make setup-test'
	}

	stage('Build and test') {
        // test
        //sh 'make test'
        maven('verify')
	}

	stage('Teardown test') {
	    // teardown test
	    sh 'make teardown-test'
	}

	//post {

	    //always {
	        //junit 'target/*-reports/*.xml'
	    //}
	//}
}
