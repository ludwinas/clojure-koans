(ns koan-engine.koans
  (:require [clojure.string :as str]
            [clojure.java.io :as io]
            [koan-engine.util :as u]))

(defn ordered-koans [answer-path]
  (map first (u/try-read (.getPath (io/resource answer-path)))))

(defn ordered-koan-paths [koan-root answer-path]
  (map (fn [koan-name]
         (.getCanonicalPath (io/file koan-root (str koan-name ".clj"))))
       (ordered-koans answer-path)))

(defn report-error [file-path line error]
  (let [message (or (.getMessage error) (.toString error))]
    (println)
    (println "Now meditate upon"
             (str (last (str/split file-path #"/"))
                  (when line (str ":" line))))
    (println "---------------------")
    (println "Assertion failed!")
    (println (.replaceFirst message "^Assert failed: " ""))))

(defn tests-pass? [file-path]
  ;; TODO: reimplement koan isolation
  (flush)
  (try (load-file file-path)
       true
       (catch clojure.lang.ExceptionInfo ei
         (report-error file-path (:line (ex-data ei)) ei)
         false)
       (catch Throwable e
         (report-error file-path nil e)
         false)))

(defn namaste []
  (println)
  (println "You have achieved clojure enlightenment. Namaste."))