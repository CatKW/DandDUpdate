<template>
    <div class="main">
        <div class="header">
            <h1 class="title">Dungeons and Dragons: Alignments</h1>
            <img class="alignment" alt="alignment" src="../assets/alignmentdnd.jpg">
          <p>Click on Description for additional details.</p>
        </div>

        <div class="content">
            <table id="alignment" class="table">
                <thead>
                    <tr>
                        <th>Alignment</th>
                        <th><a class="description" v-bind:href="'http://easydamus.com/alignment.html'">Description</a></th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="alignment in alignments" :key="alignment.id">
                        <td>{{alignment.name}}</td>
                        <td>{{alignment.description}}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
export default {
    name: "Alignments",
    data: () => ({
        alignments:[]
    }),
    async mounted() {
        console.log('alignments being mounted')
        const{data} = await this.$http.get('http://localhost:8080/api/alignment');
        console.log('alignments mounted data', data)
        this.alignments = data;
    }
}
</script>

<style scoped>


.title{
    color: darkblue;  
}
img {
    display: block;
    margin-left: auto;
    margin-right: auto;
}

.title {
    text-align: center;
}

p {
    font-style: italic;
    color: darkblue;
    text-align: center;
    margin-top: 1em;
    margin-bottom: 1em;
}

.description:hover {
    color: #5b7eb8;
}

.description {
      color: #2c3e50;
}
</style>

