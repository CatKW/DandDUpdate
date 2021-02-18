<template>
    <div class="main">
        <div class="header">
            <h1 class="title">Dungeons and Dragons: Alignments</h1>
        </div>

        <div class="content">
            <table id="alignment" class="table">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th>Description</th>
                        <th>Additional Information</th>
                    </tr>
                </thead>
                <tbody>
                    <tr v-for="alignment in alignments" :key="alignment.id">
                        <td>{{alignment.id}}</td>
                        <td>{{alignment.name}}</td>
                        <td>{{alignment.description}}</td>
                        <td>{{alignment.linkUrl}}</td>
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