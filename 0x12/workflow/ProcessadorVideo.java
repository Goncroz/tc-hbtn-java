import java.util.ArrayList;

public class ProcessadorVideo {
	
	ArrayList<CanalNotificacao> canais = new ArrayList<>();
	
	
	public ProcessadorVideo(ArrayList<CanalNotificacao> canais) {
		super();
		this.canais = canais;
	}

	public ProcessadorVideo() {
		super();
	}


	public ArrayList<CanalNotificacao> getCanais() {
		return canais;
	}

	public void setCanais(ArrayList<CanalNotificacao> canais) {
		this.canais = canais;
	}

	public void registrarCanal(CanalNotificacao canal) {
		canais.add(canal);
		}
	
	public void processar(Video video){
		for(CanalNotificacao canalNotificacao : canais) {
			canalNotificacao.notificar(new Mensagem(video.getArquivo() + " - " + video.getFormato(), TipoMensagem.LOG));
		}
		
	}

}
