(ns koan-engine.runner
  (:require [koan-engine.koans :as k]))

(def default-koan-map
  {:koan-root "src/koans"
   :koan-resource "koans.clj"})

(defn run []
  (let [{:keys [koan-root koan-resource]} default-koan-map
        paths (k/ordered-koan-paths koan-root koan-resource)]
    (loop [[f & more] paths]
      (when f
        (if (k/tests-pass? f)
          (recur more)
          (System/exit 1))))
    (k/namaste)))

(defn run-test []
  (println "test: uninmplemented"))

(defn random []
  (println "random: uninmplemented"))
