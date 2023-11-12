# By https://www.youtube.com/watch?v=nnFq2nVKxuw

<code>brew install clojure/tools/clojure</code>

<code>https://github.com/seancorfield/clj-new</code>

<code>clojure -X:new :name learnclj/passgen</code>
<code>clojure -T:build ci</code>
<code>java -jar target/net.clojars.learnclj/passgen-0.1.0-SNAPSHOT.jar</code>
<code>clojure -M -m learnclj.passgen</code>

<code>https://github.com/clojure/tools.cli</code>

<code>https://github.com/shyiko/jabba</code>

<code>export JABBA_VERSION=0.11.2
curl -sL https://github.com/shyiko/jabba/raw/master/install.sh | bash && . ~/.jabba/jabba.sh</code>

<code>jabba install graalvm-ce-java11@20.3.0</code>
<code>jabba use graalvm-ce-java11@20.3.0</code>
<code>gu install native-image</code>
<code>native-image -jar target/net.clojars.learnclj/passgen-0.1.0-SNAPSHOT.jar -H:Name=passwordgenerator</code>

