<template>
  <el-form ref="form" :model="form" label-width="auto" label-position="left">
    <el-form-item label="文章标题">
      <el-input v-model="form.blogName"></el-input>
    </el-form-item>
    <el-form-item label="文章类型">
      <el-select v-model="form.blogType" placeholder="请选择文章类型">
        <el-option label="原创" value="YC"></el-option>
        <el-option label="转载" value="ZZ"></el-option>
      </el-select>
    </el-form-item>
    <el-form-item label="文章内容">
      <el-input type="textarea" v-model="form.blogContext"></el-input>
    </el-form-item>
    <el-form-item>
      <el-button type="primary" @click="onSubmit">立即创建</el-button>
      <el-button>取消</el-button>
    </el-form-item>
  </el-form>
</template>

<script>
export default {
  data() {
    return {
      form: {
        blogName: "",
        blogType: "",
        blogContext: "",
        author: "强枭峰"    

      }
    };
  },
  methods: {
    onSubmit() {
      this.$http.post('/addBlog',this.form).then(res => {
        this.$message({
          showClose: true,
          message: '文章创建成功',
          type: 'success'
        });
        this.$router.push('/list')
      })
    }
  }
};
</script>