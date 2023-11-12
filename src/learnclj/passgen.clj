(ns learnclj.passgen
  (:require [learnclj.password :refer [generate-password]]
            [learnclj.clipboard :refer [copy]]
            [clojure.tools.cli :refer [parse-opts]])
  (:gen-class))

(defn println-yellow [& args]
  (println (str "\033[0;33m" (apply str args))))

(def cli-options
  ;; An option with a required argument
  [["-l" "--length LENGTH" "Password Length"
    :default 10
    :parse-fn #(Integer/parseInt %)
    :validate [#(< 0 % 100) "Must be a number between 0 and 100"]]
   ["-h" "--help"]])

(defn -main
  [& args]
  (let [arguments (parse-opts args cli-options)
        options (:options arguments)
        summary (:summary arguments)]

    (if (:help options)
      (println summary)
      (let [generated-password (generate-password (:length options))]
        (copy generated-password)
        (println-yellow "Your generated password is: " generated-password)))))
