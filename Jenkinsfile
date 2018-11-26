node {
	stage('Checkout') {
		sh 'echo Checking out branch: ${BRANCH_NAME}';
		git url: 'git@github.com:yipwanlai/demo-jenkinsfile.git', branch: '${BRANCH_NAME}';
	}

	stage('Set environment variables') {
		env.DH="${hostname}"
		echo "Setting environment variables DH=${env.DH}"
	}
}