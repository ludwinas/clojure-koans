(ns koan-engine.util
  (:require [clojure.java.io :as io]))

(defmacro fancy-assert
  "Assertion with fancy error messaging similar to the original engine."
  ([x] `(fancy-assert ~x ""))
  ([x message]
   `(try
      (assert (= true ~x) ~message)
      (catch Throwable e#
        (throw (ex-info (str '~message "\n" '~x)
                        {:line (:line (meta '~x))}))))))

(defn try-read [res]
  (when res
    (let [src (if (string? res)
                (or (io/resource res) res)
                res)]
      (read-string (slurp src)))))
