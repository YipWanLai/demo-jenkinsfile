build:
	echo "building..."
	echo "DH=${DH}"
	mvn build

setup-test:
	echo "setup test..."

test:
	mvn verify

teardown-test:
	echo "teardown test..."
