function list(){
	$.ajax({
		type : "post",
		url : "/producto/list",
		success : function(response) {
			$("#productoTable").bootstrapTable('load',response);
			$("#productoTable tbody").on('click','tr',function() {
				$("#id_prod").val($(this).find("td:eq(0)").text());
				$("#descrip_prod").val($(this).find("td:eq(1)").text());
                $("#unid_medida").val($(this).find("td:eq(2)").text());
                $("#id_tprod").val($(this).find("td:eq(3)").text());
				$("#btn_group_old").show();
				$("#btn_group_new").hide();
				$("#myModal").modal("show");

			});
		}
	});
}

function select(){
	$.ajax({
		type : "post",
		url : "/producto/select",
		data: "id_prod=" + $("#id_prod").val(),
		success : function(response) {
			$("#descrip_prod").val(response.descrip_prod);
            $("#unid_medida").val(response.unid_medida);
            $("#id_tprod").val(response.id_tprod);
		}
	});
}

function del(){
	$.ajax({
		type : "post",
		url : "/producto/delete",
		data: "id_prod=" + $("#id_prod").val(),
		success : function(response) {
			if (response == 1) {
				alert("Se eliminó el registro");
				list();
				$("#myModal").modal("hide");

			}			
		}
	});
}

function update(){
	$.ajax({
		type : "post",
		url : "/producto/update",
		data: {
			id_prod:$("#id_prod").val(),
			descrip_prod:$("#descrip_prod").val(),
            unid_medida:$("#unid_medida").val(),
            id_tprod:$("#id_tprod").val(),
			},
		success : function(response) {
			if (response == 1) {
				alert("Se actualizó el registro");
				list();
				$("#myModal").modal("hide");
			}			
		}
	});
}

function add() {
	$("#id_prod").val("");
	$("#descrip_prod").val("");
    $("#unid_medida").val("");
    $("#id_tprod").val("");
	$("#myModal").modal("show");
	$("#btn_group_old").hide();
	$("#btn_group_new").show();
}


function insert(){
	$.ajax({
		type : "post",
		url : "/producto/insert",
		data: {
			id_prod:$("#id_prod").val(),
			descrip_prod:$("#descrip_prod").val(),
            unid_medida:$("#unid_medida").val(),
            id_tprod:$("#id_tprod").val(),
			},
		success : function(response) {
			if (response == 1) {
				alert("Se insertó el registro");
				list();
				$("#myModal").modal("hide");
			}			
		}
	});
}