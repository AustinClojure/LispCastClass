(defn fetch-from-pantry
  ([ingredient]
     (fetch-from-pantry ingredient 1))
  ([ingredient amount]
     (if (from-pantry? ingredient)
       (do
         (go-to :pantry)
         (dotimes [i amount]
           (load-up ingredient))
         (go-to :prep-area)
         (dotimes [i amount]
           (unload ingredient)))
       (error "fetch-from-pantry cannot fetch" ingredient))))

(defn fetch-from-fridge
  ([ingredient]
     (fetch-from-fridge ingredient 1))
  ([ingredient amount]
     (if (from-fridge? ingredient)
       (do
         (go-to :fridge)
         (dotimes [i amount]
           (load-up ingredient))
         (go-to :prep-area)
         (dotimes [i amount]
           (unload ingredient)))
       (error "fetch-from-fridge cannot fetch" ingredient))))
