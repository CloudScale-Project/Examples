graph [
directed 1
node [
name "tpcw.TPCW_shopping_cart_interaction"
label "tpcw.TPCW_shopping_cart_interaction"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_Util"
label "tpcw.TPCW_Util"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_Database"
label "tpcw.TPCW_Database"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_best_sellers_servlet"
label "tpcw.TPCW_best_sellers_servlet"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_say_hello"
label "tpcw.TPCW_say_hello"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_order_inquiry_servlet"
label "tpcw.TPCW_order_inquiry_servlet"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_customer_registration_servlet"
label "tpcw.TPCW_customer_registration_servlet"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_search_request_servlet"
label "tpcw.TPCW_search_request_servlet"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_admin_response_servlet"
label "tpcw.TPCW_admin_response_servlet"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_buy_request_servlet"
label "tpcw.TPCW_buy_request_servlet"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_new_products_servlet"
label "tpcw.TPCW_new_products_servlet"
graphics
[hasFill 0
]
]
node [
name "tpcw.DatabaseProperties"
label "tpcw.DatabaseProperties"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_home_interaction"
label "tpcw.TPCW_home_interaction"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_product_detail_servlet"
label "tpcw.TPCW_product_detail_servlet"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_order_display_servlet"
label "tpcw.TPCW_order_display_servlet"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_admin_request_servlet"
label "tpcw.TPCW_admin_request_servlet"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_buy_confirm_servlet"
label "tpcw.TPCW_buy_confirm_servlet"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_execute_search"
label "tpcw.TPCW_execute_search"
graphics
[hasFill 0
]
]
node [
name "tpcw.TPCW_promotional_processing"
label "tpcw.TPCW_promotional_processing"
graphics
[hasFill 0
]
]
edge [
source "tpcw.TPCW_shopping_cart_interaction"
target "tpcw.TPCW_Database"
label "From: TPCW_shopping_cart_interaction To: TPCW_Database Count: 3"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_shopping_cart_interaction"
target "tpcw.TPCW_promotional_processing"
label "From: TPCW_shopping_cart_interaction To: TPCW_promotional_processing Count: 1"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_Database"
target "tpcw.DatabaseProperties"
label "From: TPCW_Database To: DatabaseProperties Count: 3"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_Database"
target "tpcw.TPCW_Util"
label "From: TPCW_Database To: TPCW_Util Count: 6"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_best_sellers_servlet"
target "tpcw.TPCW_promotional_processing"
label "From: TPCW_best_sellers_servlet To: TPCW_promotional_processing Count: 1"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_best_sellers_servlet"
target "tpcw.TPCW_Database"
label "From: TPCW_best_sellers_servlet To: TPCW_Database Count: 1"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_say_hello"
target "tpcw.TPCW_Database"
label "From: TPCW_say_hello To: TPCW_Database Count: 1"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_customer_registration_servlet"
target "tpcw.TPCW_Database"
label "From: TPCW_customer_registration_servlet To: TPCW_Database Count: 1"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_search_request_servlet"
target "tpcw.TPCW_promotional_processing"
label "From: TPCW_search_request_servlet To: TPCW_promotional_processing Count: 1"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_admin_response_servlet"
target "tpcw.TPCW_Database"
label "From: TPCW_admin_response_servlet To: TPCW_Database Count: 3"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_buy_request_servlet"
target "tpcw.TPCW_Database"
label "From: TPCW_buy_request_servlet To: TPCW_Database Count: 7"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_new_products_servlet"
target "tpcw.TPCW_promotional_processing"
label "From: TPCW_new_products_servlet To: TPCW_promotional_processing Count: 1"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_new_products_servlet"
target "tpcw.TPCW_Database"
label "From: TPCW_new_products_servlet To: TPCW_Database Count: 1"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_home_interaction"
target "tpcw.TPCW_say_hello"
label "From: TPCW_home_interaction To: TPCW_say_hello Count: 1"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_home_interaction"
target "tpcw.TPCW_promotional_processing"
label "From: TPCW_home_interaction To: TPCW_promotional_processing Count: 1"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_product_detail_servlet"
target "tpcw.TPCW_Database"
label "From: TPCW_product_detail_servlet To: TPCW_Database Count: 2"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_order_display_servlet"
target "tpcw.TPCW_Database"
label "From: TPCW_order_display_servlet To: TPCW_Database Count: 2"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_admin_request_servlet"
target "tpcw.TPCW_Database"
label "From: TPCW_admin_request_servlet To: TPCW_Database Count: 2"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_buy_confirm_servlet"
target "tpcw.TPCW_Database"
label "From: TPCW_buy_confirm_servlet To: TPCW_Database Count: 2"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_execute_search"
target "tpcw.TPCW_promotional_processing"
label "From: TPCW_execute_search To: TPCW_promotional_processing Count: 1"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_execute_search"
target "tpcw.TPCW_Database"
label "From: TPCW_execute_search To: TPCW_Database Count: 3"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_promotional_processing"
target "tpcw.TPCW_Util"
label "From: TPCW_promotional_processing To: TPCW_Util Count: 2"
graphics
[
targetArrow "standard"
]
]
edge [
source "tpcw.TPCW_promotional_processing"
target "tpcw.TPCW_Database"
label "From: TPCW_promotional_processing To: TPCW_Database Count: 1"
graphics
[
targetArrow "standard"
]
]
]
