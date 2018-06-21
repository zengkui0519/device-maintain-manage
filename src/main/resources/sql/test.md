select
===
	select #use("cols")# from TEST  where  #use("condition")#

cols
===
	ID,NAME

updateSample
===
	
	ID=#id#,NAME=#name#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and ID=#id#
	@}
	@if(!isEmpty(name)){
	 and NAME=#name#
	@}
	