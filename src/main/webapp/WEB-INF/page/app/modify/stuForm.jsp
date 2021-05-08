<%--
  Created by IntelliJ IDEA.
  User: 13681864361
  Date: 2019/4/21
  Time: 9:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <c:set var="ctx" value="${pageContext.request.contextPath}"/>
    <title>layuiAdmin 文章管理 iframe 框</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${ctx}/static/plugins/layuiadmin/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="${ctx}/static/plugins/layuiadmin/style/admin.css" media="all">

</head>
<body>

<div class="layui-form" lay-filter="layuiadmin-app-form-list" id="layuiadmin-app-form-list"
     style="padding: 20px 30px 0 0;">
    <div class="layui-form-item">
        <label class="layui-form-label">学号</label>
        <div class="layui-input-inline">
            <input type="text" name="id" value="" class="layui-input" lay-verify="stuId">
            <input type="text" name="oriId" value="${stuAllInfo.stuNum}" class="layui-input" style="display:none;">
        </div>
        <div class="layui-form-mid " style="color:red">*必填项</div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">姓名</label>
        <div class="layui-input-inline">
            <input type="text" name="name" value="" class="layui-input" lay-verify="name">
        </div>
        <div class="layui-form-mid " style="color:red">*必填项</div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">性别</label>
        <div class="layui-col-md12 layui-input-inline">
            <input type="radio" name="sex" value="男" title="男" checked>
            <input type="radio" name="sex" value="女" title="女">
        </div>
        <div class="layui-form-mid " style="color:red">*必填项</div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">出生日期</label>
        <div class="layui-input-inline">
            <input type="text" class="layui-input" id="birthday" name="birthday" lay-verify="birthday">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">年级</label>
        <div class="layui-input-inline">
            <select name="grade" id="grade" lay-verify="required">
                <option value="">请选择年级</option>
            </select>
        </div>
        <div class="layui-form-mid " style="color:red">*必填项</div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">学位</label>
        <div class="layui-input-inline">
            <select name="degree" lay-verify="required">
                <option value="">请选择标签</option>
                <option value="本科">本科</option>
                <option value="硕士">硕士</option>
                <option value="博士">博士</option>
            </select>
        </div>
        <div class="layui-form-mid " style="color:red">*必填项</div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">学院-专业-班级</label>
        <div class="layui-input-inline">
            <select id="college" name="college" lay-search lay-filter="college" lay-verify="required">
                <option value="">请选择学院</option>
                <%--<option value="电子信息与电气工程学院">电子信息与电气工程学院</option>--%>
            </select>
        </div>
        <div class="layui-input-inline">
            <select id="major" name="major" lay-search lay-filter="major" lay-verify="required">
                <option value="">请选择专业</option>
            </select>
        </div>
        <div class="layui-input-inline">
            <select id="clazz" name="clazz" lay-search lay-filter="clazz" lay-verify="required">
                <option value="">请选择班级</option>
            </select>
        </div>
        <div class="layui-form-mid " style="color:red">*必填项</div>
    </div>
      <div class="layui-form-item">
        <label class="layui-form-label">民族</label>
        <div class="layui-input-inline">
            <input type="text" name="nation" value="" class="layui-input">
        </div>
    </div>
     <div class="layui-form-item">
        <label class="layui-form-label">学籍状态</label>
        <div class="layui-col-md12 layui-input-inline">
            <input type="radio" name="status" value="在籍" title="在籍" checked>
            <input type="radio" name="status" value="非在籍" title="非在籍">
            <input type="radio" name="status" value="退学" title="退学">
        </div>
        <div class="layui-form-mid " style="color:red">*必填项</div>
    </div>
    <!-- 111 -->
     <div class="layui-form-item">
        <label class="layui-form-label">计算机基础</label>
        <div class="layui-input-inline">
            <input type="text" name="schoolName" value="" class="layui-input">
        </div>
    </div>
    <!-- 111 -->
    <!-- 111 -->
   
    <!-- 111 -->
    <!-- 111 -->
     <div class="layui-form-item">
        <label class="layui-form-label">思修</label>
        <div class="layui-input-inline">
            <input type="text" name="idNumber" value="" class="layui-input">
        </div>
    </div>
    <!-- 111 -->
    <!-- 111 -->
     <div class="layui-form-item">
        <label class="layui-form-label">毛概</label>
        <div class="layui-input-inline">
            <input type="text" name="gradation" value="" class="layui-input">
        </div>
    </div>
    <!-- 111 -->
    <!-- 111 -->
   <!--   <div class="layui-form-item">
        <label class="layui-form-label">层次</label>
        <div class="layui-input-inline">
            <input type="text" name="Length" value="" class="layui-input">
        </div>
    </div> -->
    <!-- 111 -->
    <!-- 111 -->
     <div class="layui-form-item">
        <label class="layui-form-label">英语</label>
        <div class="layui-input-inline">
            <input type="text" name="degreeCategory" value="" class="layui-input">
        </div>
    </div>
    <!-- 111 -->
    <!-- 111 -->
     <div class="layui-form-item">
        <label class="layui-form-label">高数</label>
        <div class="layui-input-inline">
            <input type="text" name="degreeForm" value="" class="layui-input">
        </div>
    </div>
    <!-- 111 -->
   <!--  <div class="layui-form-item">
        <label class="layui-form-label">入学日期</label>
        <div class="layui-input-inline">
            <input type="text" class="layui-input" id="enrollmentDate" name="enrollmentDate" lay-verify="enrollmentDate">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">预计毕业日期</label>
        <div class="layui-input-inline">
            <input type="text" class="layui-input" id="estimatedDate" name="estimatedDate" lay-verify="estimatedDate">
        </div>
    </div> -->
   
    <div class="layui-form-item">
        <label class="layui-form-label">联系方式</label>
        <div class="layui-input-inline">
            <input type="text" name="phone" value="" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">备注</label>
        <div class="layui-input-inline">
            <textarea name="remark" style="width: 400px; height: 150px;" class="layui-textarea"
                      lay-verify="remark"></textarea>
        </div>
    </div>
    <div class="layui-form-item layui-hide">
        <input type="button" lay-submit lay-filter="layuiadmin-app-form-submit" id="layuiadmin-app-form-submit"
               value="确认添加">
        <input type="button" lay-submit lay-filter="layuiadmin-app-form-edit" id="layuiadmin-app-form-edit"
               value="确认编辑">
    </div>
</div>

<script src="${ctx}/static/plugins/layuiadmin/layui/layui.js"></script>
<script src="${ctx}/static/custom/js/myLayVerify.js"></script>
<script src="${ctx}/static/custom/js/myValidity.js"></script>
<script>
    layui.config({
        base: '${ctx}/static/plugins/layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use(['index', 'form', 'laydate'], function () {
        var $ = layui.$
            , form = layui.form
            , laydate = layui.laydate;

        laydate.render({
            elem: '#birthday' //指定元素
            , value: '2000-1-1'
            , isInitValue: false //是否允许填充初始值，默认为 true'
            , min: '1920-1-1'
            , max: '2018-12-31'
        });
       /*  laydate.render({
            elem: '#enrollmentDate' //指定元素
            , value: '2000-1-1'
            , isInitValue: false //是否允许填充初始值，默认为 true'
            , min: '1920-1-1'
            , max: '2018-12-31'
        });
        laydate.render({
            elem: '#estimatedDate' //指定元素
            , value: '2000-1-1'
            , isInitValue: false //是否允许填充初始值，默认为 true'
            , min: '1920-1-1'
            , max: '2018-12-31'
        }); */

        //从数据库异步获取年级数据填充到年级select框中
        $.ajax({
            async: false,
            type: "get",
            url: "${ctx}/grade/getGradeName",
            success: function (data) {
                for (var i = 0; i < data.length; i++) {
                    var json = data[i];
                    var str = "";
                    str += '<option value="' + json.gradeName + '">' + json.gradeName + '</option>';
                    $("#grade").append(str);
                }
                form.render('select');
            }
        });
        $("#grade").val('${stuAllInfo.stuGradeName}');

        //从数据库异步获取学院数据填充到学院select框中
        $.ajax({
            async: false,
            type: "get",
            url: "${ctx}/college/getCollegeName",
            success: function (data) {
                for (var i = 0; i < data.length; i++) {
                    var json = data[i];
                    $("#college").append('<option value="' + json.collegeName + '">' + json.collegeName + '</option>');
                }
                form.render('select');
            }
        });


        $("#college").val('${stuAllInfo.stuCollegeName}');//根据父页面传来的model来预渲染联动select
        $("#major").empty();
        $("#major").append('<option value="">请选择专业</option>');
        var college_name = $("#college").val();
        $.ajax({
            async: false,
            type: "get",
            data: {collegeName: college_name},
            url: "${ctx}/major/getMajorNameByCollege",
            success: function (data) {
                for (var i = 0; i < data.length; i++) {
                    var json = data[i];
                    $("#major").append('<option value="' + json.majorName + '">' + json.majorName + '</option>');
                }
                form.render('select');
            }
        });

        $("#major").val('${stuAllInfo.stuMajorName}');
        $("#clazz").empty();
        $("#clazz").append('<option value="">请选择班级</option>');
        var major_name = $("#major").val();
        $.ajax({
            async: false,
            type: "get",
            data: {majorName: major_name},
            url: "${ctx}/class/getClassNameByMajor",
            success: function (data) {
                for (var i = 0; i < data.length; i++) {
                    var json = data[i];
                    $("#clazz").append('<option value="' + json.className + '">' + json.className + '</option>');
                }
                form.render('select');
            }
        });

        $("#clazz").val('${stuAllInfo.stuClassName}');
        form.render('select');

        //联动监听select
        form.on('select(college)', function (data) {
            $("#clazz").val("");
            //获取部门的ID通过异步查询子集
            $("#major").empty();
            $("#major").append('<option value="">请选择专业</option>');
            var college_name = $(this).attr("lay-value");
            $.ajax({
                type: "get",
                data: {collegeName: college_name},
                url: "${ctx}/major/getMajorNameByCollege",
                success: function (data) {
                    for (var i = 0; i < data.length; i++) {
                        var json = data[i];
                        $("#major").append('<option value="' + json.majorName + '">' + json.majorName + '</option>');
                    }
                    form.render('select');
                }
            });
        });
        form.on('select(major)', function (data) {
            //获取部门的ID通过异步查询子集
            $("#clazz").empty();
            $("#clazz").append('<option value="">请选择班级</option>');
            var major_name = $(this).attr("lay-value");
            $.ajax({
                type: "get",
                data: {majorName: major_name},
                url: "${ctx}/class/getClassNameByMajor",
                success: function (data) {
                    for (var i = 0; i < data.length; i++) {
                        var json = data[i];
                        $("#clazz").append('<option value="' + json.className + '">' + json.className + '</option>');
                    }
                    form.render('select');
                }
            });
        });


    })
</script>
</body>
</html>
