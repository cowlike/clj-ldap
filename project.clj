(defproject org.clojars.jrk/clj-ldap "0.0.9"
  :description "Clojure ldap client (development fork of pauldorman's clj-ldap)."
  :url "https://github.com/cowlike/clj-ldap"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [com.unboundid/unboundid-ldapsdk "2.3.0"]]
  :dev-dependencies [[jline "0.9.94"]
                     [org.apache.directory.server/apacheds-all "1.5.5"]
                     [fs "1.1.2"]
                     [org.slf4j/slf4j-simple "1.5.6"]
                     [lein-clojars "0.7.0"]]
  :aot [clj-ldap.client]
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"})

