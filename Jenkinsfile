node {
	stage('Checkout') {
		sh 'echo Checking out branch: ${GIT_BRANCH}';
		git url: 'git@github.com:yipwanlai/demo-jenkinsfile.git', branch: '${GIT_BRANCH}';
	}
}
