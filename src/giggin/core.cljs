(ns giggin.core
  (:require [reagent.core :as r]))

;;In JS: const app = () => (<div class="container"></div>);
(defn app
  []
  [:div.container])

(defn ^:export main
  []
  (r/render
    [app]
    (.getElementById js/document "app")))
