(ns learnclj.clipboard)

(import [java.awt.datatransfer StringSelection])

(defn ^java.awt.datatransfer.Clipboard get-clipboard []
  (-> (java.awt.Toolkit/getDefaultToolkit)
      (.getSystemClipboard)))

(defn copy [text]
  (let [^java.awt.datatransfer.StringSelection selection (StringSelection. text)]
    (.setContents (get-clipboard) selection selection)))


;; Java awt
;; import java.awt.datatransfer.StringSelection;
;; import java.awt.Toolkit;
;; import java.awt.datatransfer.Clipboard;
;; String myString = "This text will be copied into clipboard";
;; StringSelection stringSelection = new StringSelection (myString);
;; Clipboard clipboard = Toolkit.getDefaultToolkit () .getSystemClipboard ();
;; clipboard.setContents (stringSelection, null);